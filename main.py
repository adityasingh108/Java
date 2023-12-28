# def f(a ):
#     if a[-1].isdigit():
#         n = len(a) -1
#         c = str(n)
#         if len(c) == 9:
#             return -1
#         if c[0] == a[-1]:
#             return c[1]
#     if  len(str( len(a))) == 9:
#         return -1
#     return a *str(len(a))

# a = input() 
# print(f(a))   



# def draw_fountain(n):
#     print("Steps: ", end="")

#     for i in range(n):
#         print(i+1, end=" ")
#     print()

# # Print middle rows

#     for i in range(n-2):
#         print(" "*(n+1), end="")

#         for j in range(n):
#             print("_", end=" ")

#         print()

#     # Print bottom row

#     print(" "*(n+1), end="")

#     for i in range(n):

#         print(i+1, end=" ")

# # Test the function with different number of steps

#     # for i in range(1, 10):

#     #     print(f"Fountain with {i} steps:")

#     #     draw_fountain(i)
#     #     print()

# a = int(input())
# draw_fountain(a)




# Input is an positive integer describing the step levels of the fountain
# n = int(input("Enter the number of steps: "))

# # Initialize an empty list to store the pattern
# pattern = []

# # Loop from 1 to n
# for i in range(1, n+1):
#   # Create a row of n-i spaces followed by i numbers
#   row = " " * (n-i) + " ".join(str(i) for _ in range(i))
#   # Append the row and its mirror image to the pattern
#   pattern.append(row + row[::-1])
#   # Print the row and its mirror image
#   print(row + row[::-1])

# # Loop from n-1 to 1
# for i in range(n-1, 0, -1):
#   # Get the row from the pattern list
#   row = pattern[i-1]
#   # Print the row and its mirror image
#   print(row + row[::-1])


import threading

def hello():
  while True:
    print("Hello")

def world():
  while True:
    print("World")
    

t1 = threading.Thread(target=hello)
t2 = threading.Thread(target=world)

t1.start()
t2.start()

# t1.join()
# t2.join()

        