print("Giai phuong trinh co dang ax+b=0")
a=int(input("Nhap a: "))
b=int(input("Nhap b: "))
if a==0:
    if b==0:
        print("Phung trinh vo so nghiem")
    elif b!=0:
        print("Phuong trinh vo nghiem")
else:
    print("Phuong trinh co nghiem la x= ",-b/a)
    