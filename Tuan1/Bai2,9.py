a=int(input("Nhap thu ngay: "))
while a<=1 or a>=8:
    a=int(input("Nhap so tuong ung tu 2->8: "))
if a==2:
    print("Monday")
elif a==3:
    print("Tuesday")
elif a==4:
    print("Wednesday")
elif a==5:
    print("Thursday")
elif a==6:
    print("Friday")
elif a==7:
    print("Saturday")
elif a==8:
    print("Sunday")