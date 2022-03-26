number_list = list(input("Enter the req number seq: ").split(", "))

print(number_list)
print(len(number_list))
sum = 0
for n in number_list:
  sum += int(n)

print(sum)    