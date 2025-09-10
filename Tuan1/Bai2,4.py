a=int(input("Nhap canh cua tam giac: "))
b=int(input("Nhap canh thu 2 cua tam giac: "))
c=int(input("Nhap canh thu 3 cua tam giac: "))
if a+b>c and a+c>b and b+c>a:
    if a==b and b==c:
        print("Tam giac deu")
    else:
        print("Khong phai la tam giac deu")
else:
    print("Khong phai la tam giac")