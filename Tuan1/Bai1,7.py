if __name__=="__main__":
    tich=1
    for i in range(4):
        a=float(input("Nhap so thu "+(str)(i+1)+": "))
        tich*=a
    print("Trung binh nhan cua 4 so la",tich**(1/4))