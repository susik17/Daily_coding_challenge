'''
n=int(input("n:"))
arr=[]
for i in range(n):
    ele=int(input())
    arr.append(ele)
    '''
#function
arr=[0,1,3]
n=3
def missingnum(arr,n):
    total=(n*(n+1))//2
    arr_sum=0
    for num in arr:
        arr_sum+=num
    return total-arr_sum
ans=missingnum(arr,n)
print(ans)