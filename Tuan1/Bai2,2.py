a=int(input("Nhap so nguyen a: "))
b=int(input("Nhap so nguyen b: "))
c=int(input("Nhap so nguyen c: "))
d=int(input("Nhap so nguyen d: "))
if a>b and a>c and a>d:
    print("So lon nhat la: ",a)
elif b>a and b>c and b>d:
    print("So lon nhat la: ",b)
elif c>a and c>b and c>d:
    print("So lon nhat la: ",c)
else:
    print("So lon nhat la: ",d)