if __name__=="__main__":
    tong=0
    for i in range(4):
        a=float(input("Nhap so thu "+ (str)(i+1)+": "))
        tong+=a
    print("Trung binh cong cua 4 so la:",  tong/4)