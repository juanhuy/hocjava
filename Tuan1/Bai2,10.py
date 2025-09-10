while True:
    print("1.Hinh vuong")
    print("2.Hinh chu nhat")
    print("3.Hinh tron")
    print("4.Hinh tam giac")
    print("5.Hinh thang")
    print("6.Thoat")
    luachon=int(input("Nhap lua chon cua ban: "))
    if luachon==1:
        a=int(input("Nhap canh hinh vuong: "))
        print("Dien tich hinh vuong la: ",a*a)
    elif luachon==2:
        a=int(input("Nhap chieu dai hinh chu nhat: "))
        b=int(input("Nhap chieu rong hinh chu nhat: "))
        print("Dien tich hinh chu nhat la: ",a*b)
    elif luachon==3:
        r=int(input("Nhap ban kinh hinh tron: "))
        print("Dien tich hinh tron la: ",3.14*r*r)
    elif luachon==4:
        a=int(input("Nhap canh thu 1 cua tam giac: "))
        b=int(input("Nhap canh thu 2 cua tam giac: "))
        c=int(input("Nhap canh thu 3 cua tam giac: "))
        p=(a+b+c)/2
        print("Dien tich hinh tam giac la: ",(p*(p-a)*(p-b)*(p-c))**0.5)
    elif luachon==5:
        a=int(input("Nhap day lon hinh thang: "))
        b=int(input("Nhap day nho hinh thang: "))
        h=int(input("Nhap chieu cao hinh thang: "))
        print("Dien tich hinh thang la: ",((a+b)*h)/2)
    elif luachon==6:
        break