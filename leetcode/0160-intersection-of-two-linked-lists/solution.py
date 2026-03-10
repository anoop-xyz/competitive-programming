class Solution:
    def getIntersectionNode(self,headA,headB):
        if not headA or not headB :
            return None
        PA=headA
        PB=headB
        while PA!=PB:
            if PA is None:
                PA=headB
            else:
                PA=PA.next
            if PB is None:
                PB=headA
            else:
                PB=PB.next
        return PA
