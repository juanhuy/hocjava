if __name__=="__main__":
    a=int(input("Nhap so nguyen duong a: "))
    b=int(input("Nhap so nguyen duong b: "))
    print("Truoc khi hoan doi, a =",a,"b =",b)
    a,b=b,a
    print("Sau khi hoan doi, a =",a,"b =",b)