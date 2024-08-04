from typing import List

class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        graph = {}
        
        def add_edge(start, end, value):
            if start in graph:
                graph[start].append((end, value))
            else:
                graph[start] = [(end, value)]
            if end in graph:
                graph[end].append((start, 1 / value))
            else:
                graph[end] = [(start, 1 / value)]
        
        for (a, b), value in zip(equations, values):
            add_edge(a, b, value)
        
        def bfs(start, end):
            if start not in graph or end not in graph:
                return -1.0
            queue = [(start, 1.0)]
            visited = set()
            for node, val in queue:
                if node == end:
                    return val
                visited.add(node)
                for neighbor, weight in graph[node]:
                    if neighbor not in visited:
                        queue.append((neighbor, val * weight))
            return -1.0
        
        results = []
        for query in queries:
            results.append(bfs(query[0], query[1]))
        
        return results
