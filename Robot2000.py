
robot1000=input()  #"NENENENE"
state='N'

robot2000=[]
start=1


if len(robot1000)>100:
    quit()

for y in range(len(robot1000)):
    if robot1000[y] == 'N' or robot1000[y] == 'E' or robot1000[y] == 'W'or robot1000[y] == 'S'or robot1000[y] == 'Z':
        continue
    else:
        quit()


for i in robot1000:
    # if i==robot1000[0] and start==1:
    #     robot2000.append('F')


        # state=i
        # start=0
        # continue


    if i=='N':
        if state=='N':
            robot2000.append('F')
            state='N'
        
        if state=='E':
            robot2000.append('RRRF')
            state='N'
        
        if state=='W':
            robot2000.append('RF')
            state='N'
        
        if state=="S":
            robot2000.append('RRF')
            state='N'



    if i=='E':
        if state=='E':
            robot2000.append('F')
            state='E'
        
        if state=='N':
            robot2000.append('RF')
            state='E'
        
        if state=='S':
            robot2000.append('RRRF')
            state='E'
        
        if state=='W':
            robot2000.append('RRF')
            state='E'


    if i=='W':
        if state=='W':
            robot2000.append('F')
            state='W'
        
        if state=='S':
            robot2000.append('RF')
            state='W'
        
        if state=='N':
            robot2000.append('RRRF')
            state='W'
        
        if state=='E':
            robot2000.append('RRF')
            state='W'


    if i=='S':
        if state=='S':
            robot2000.append('F')
            state='S'

        if state=='E':
            robot2000.append('RF')
            state='S'

        if state=='W':
            robot2000.append('RRRF')
            state='S'
        
        if state=='N':
            robot2000.append('RRF')
            state='S'
    
    if i=='Z':
        robot2000.append('Z')
        state='N'

for i in robot2000:
    print(i,end="")