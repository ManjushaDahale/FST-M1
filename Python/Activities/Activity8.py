from posixpath import split


number = list(input("Enter comma sep numbers: ").split(", "))
print(number)
print(len(number))
print(int(number[len(number)-1]))
if(int(number[0])==int(number[len(number)-1])):
     print(True)
else:
    print(False)