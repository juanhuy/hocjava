import math
def nuachuvi(a,b,c):
    p=(a+b+c)/2
    return p
def dientich(a,b,c):
    p=nuachuvi(a,b,c)
    s=math.sqrt(p*(p-a)*(p-b)*(p-c))
    return s
if __name__=="__main__":
    a=float(input("Nhap canh a: "))
    b=float(input("Nhap canh b: "))
    c=float(input("Nhap canh c: "))
    
    print("Dien tich tam giac la: ",dientich(a,b,c))