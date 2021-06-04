n=int (input())
#string word ;
#string wordRef;
lis=[]
count=0

for i in range(n):
    word = list(input())
    wordRef=list(input());

    word.sort()
    wordRef.sort()
    
    if word == wordRef:
        lis.append("ANAGRAM")
    else:
        lis.append("NOT ANAGRAM")

print(*lis,sep="\n")


    
