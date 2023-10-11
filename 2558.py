class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        pq = [-x for x in gifts]
        heapq.heapify(pq)

        while pq and k:
            x = -heapq.heappop(pq)
            left = int(sqrt(x))
            heapq.heappush(pq, -left)
            k -= 1

        return sum([ -x for x in pq])
