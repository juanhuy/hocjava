a=int(input("Nhap canh cua tam giac: "))
b=int(input("Nhap canh thu 2 cua tam giac: "))
c=int(input("Nhap canh thu 3 cua tam giac: "))
if a+b>c and a+c>b and b+c>a:
    if a**2==b**2+c**2 or b**2==a**2+c**2 or c**2==a**2+b**2:
        print("Tam giac vuong")
    else:
        print("Khong phai tam giac vuong")
else:
    print("Khong phai tam giac")