from array import*
import numpy as np

arr = np.array(((0,0,1,0),(0,0,0,1),(0,0,1,0)))

print(arr)

a=np.where(arr==1)
print(a)
                    

# Display Array
# for i in range(n):
#     print("\n")
#     for j in range(n):
#         print(arr[i][j],end=" ")
# print("\n",ref)