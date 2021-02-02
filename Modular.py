def GCD(a,b):
    if a != 0:
        g, y, x = GCD(b % a, a)
        return g, x - (b // a) * y, y
    if a == 0:
        return b, 0, 1

def InverseMod(a,n):
    g, x, y = GCD(a, n)
    return x % n

def ModDivion(a,b,n):
    mod = InverseMod(b, n)
    return (a * mod) % n

a,b,n = map(int, input().split())
print(ModDivion(a, b, n))