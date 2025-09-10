n=int(input("Nhap so nguyen n co ba chu so: "))
a=[]
while n>0:
    s=n%10
    n=n//10
    a.append(s)
print("Chu so hang tram la:",a[2])
print("Chu so hang chuc la: ",a[1])
print("Chu so hang don vi la: ",a[0])
