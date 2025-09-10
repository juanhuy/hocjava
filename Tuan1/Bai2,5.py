a=int(input("Nhap canh cua tam giac: "))
b=int(input("Nhap canh thu 2 cua tam giac: "))
c=int(input("Nhap canh thu 3 cua tam giac: "))
if a+b>c and a+c>b and b+c>a:
    if a==b or b==c or a==c:
        print("La tam giac can")
    else:
        print("Khong phai la tam giac can")
else:
    print("Khong phai la tam giac")