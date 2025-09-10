print("Giai phuong trinh bac 2: ax^2 + bx + c = 0")
a=int(input("Nhap a: "))
b=int(input("Nhap b: "))
c=int(input("Nhap c: "))
if a==0:
    if b==0:
        if c==0:
            print("Phuong trinh vo so nghiem")
        else:
            print("Phuong trinh vo nghiem")
    else:
        print("Phuong trinh co nghiem la x= ",-c/b)
else:
    delta=b**2-4*a*c
    if delta<0:
        print("Phuong trinh vo nghiem")
    elif delta==0:
        print("Phuong trinh co nghiem kep x1=x2= ",-b/(2*a))
    else:
        print("Phuong trinh co hai nghiem phan biet:")
        print("x1= ",(-b+delta**0.5)/(2*a))
        print("x2= ",(-b-delta**0.5)/(2*a))
