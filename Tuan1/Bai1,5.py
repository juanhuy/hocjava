def tbc(a,b,c,d):
    return (a+b+c+d)/4
if __name__=="__main__":
    a=float(input("Nhap so thu nhat: "))
    b=float(input("Nhap so thu hai: "))
    c=float(input("Nhap so thu ba: "))
    d=float(input("Nhap so thu tu: "))
    print("Trung binh cong cua 4 so la: ",tbc(a,b,c,d))