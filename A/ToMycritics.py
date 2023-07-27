def solve():
    sum = int(input())
    a, b, c = [int(x) for x in input().split()]
    list = [a,b,c]

    for i in list:
        if sum -a == i or sum-b == i or sum-c ==i:
            print("YES")
            return
        
    print("NO")
    return
    

    

