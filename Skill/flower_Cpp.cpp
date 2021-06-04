#include <iostream>

using namespace std ; 


int main()
{
    int n;
    cin >> n; 
    int arr[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }
     
     /*int n=7;
     int arr[n][n]{  {0,0,0,0,0,0,0},
                    {0,0,0,0,0,2,0},
                    {0,0,0,1,0,0,0},
                    {0,0,0,0,0,0,0},
                    {0,0,0,1,0,0,0},
                    {0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0}
                    }; //***TestCase    */  

    // for(int i=0 ;i<n;i++)
    // {
    //     cout<<endl;
    //     for(int j=0 ;j<n;j++)
    //     {
    //         cout<<arr[i][j]<<" ";
    //     }
    // } 
    

    for(int i=0 ;i<n;i++) // Column
    {
        for(int j=0 ;j<n;j++) // RoW 
        { 
            if(arr[i][j]>=1)                                 //If Column Row >= 1 
            {
                if(arr[i-1][j]==0){                              // If Column Above is 0  
                    for(int c=i-1;c>=i-arr[i][j];c--)                 // Loop : Column Above to (Column Pressent - Center Value)   
                    {
                        if(c<0){                                        // If Column Out Of Array -> Stop  
                            break;                                      
                        }
                        if(arr[c][j]!=0){                               // If Column Above != 0 -> Stop 
                            break;
                        }
                        arr[c][j]=-1;                                   // Above of Center = -1  
                        
                        if(arr[c][j+1]==0){                             // If Column Above Right == 0
                            for(int y=j+1;y<=j+arr[i][j];y++){          // Loop : Row Right to (Row Present + Center Value)
                                if(y>(n-1)){
                                    break;
                                }
                                if(arr[c][y]!=0)
                                {
                                    break;
                                }
                                arr[c][y]=-1;
                            }
                        }
                        if(arr[c][j-1]==0){
                            for(int y=j-1;y>=j-arr[i][j];y--){
                                if(y<0){
                                    break;
                                }
                                if(arr[c][y]!=0){
                                    break;
                                }
                                arr[c][y]=-1;
                            }
                        }
                        
                        
                    }
                }
                if(arr[i+1][j]==0){
                    for(int c=i+1;c<=i+arr[i][j];c++){
                        if(c>(n-1)){
                            break;
                        }
                        if(arr[c][j]!=0){
                            break;
                        }
                        arr[c][j]=-1;
                        
                        if(arr[c][j+1]==0){
                            for(int y=j+1;y<=j+arr[i][j];y++){
                                if(y>(n-1)){
                                    break;
                                }
                                if(arr[c][y]!=0)
                                {
                                    break;
                                }
                                arr[c][y]=-1;
                            }
                        }
                        if(arr[c][j-1]==0){
                            for(int y=j-1;y>=j-arr[i][j];y--){
                                if(y<0){
                                    break;
                                }
                                if(arr[c][y]!=0){
                                    break;
                                }
                                arr[c][y]=-1;
                            }
                        }
                        
                    }
                }
                if(arr[i][j-1]==0){
                    for(int c=j-1;c>=j-arr[i][j];c--){
                        if(c<0){
                            break;
                        }
                        if(arr[i][c]!=0)
                        {
                            break;
                        }
                        arr[i][c]=-1;
                        if(arr[i-1][c]==0){
                            for(int y=i-1;y>=i-arr[i][j];y--)
                            {
                                if(y<0){
                                    break;
                                }
                                if(arr[y][c]!=0){
                                    break;
                                }
                                arr[y][c]=-1;
                            }
                        }
                        if(arr[i+1][c]==0){
                            for(int y=i+1;y<=i+arr[i][j];y++){
                                if(y>(n-1)){
                                    break;
                                }
                                if(arr[y][c]!=0){
                                    break;
                                }
                                arr[y][c]=-1;
                            }
                        }
                }
            }
                if(arr[i][j+1]==0){
                    for(int c=j+1;c<=j+arr[i][j];c++){
                        if(c>(n-1)){
                            break;
                        }
                        if(arr[i][c]!=0)
                        {
                            break;
                        }
                        
                        arr[i][c]=-1;
                        if(arr[i-1][c]==0){
                            for(int y=i-1;y>=i-arr[i][j];y--)
                            {
                                if(y<0){
                                    break;
                                }
                                if(arr[y][c]!=0){
                                    break;
                                }
                                arr[y][c]=-1;
                            }
                        }
                        if(arr[i+1][c]==0){
                            for(int y=i+1;y<=i+arr[i][j];y++){
                                if(y>(n-1)){
                                    break;
                                }
                                if(arr[y][c]!=0){
                                    break;
                                }
                                arr[y][c]=-1;
                            }
                        }
                }
            }
                
        }
            
            
        }
     
    
    } 

    // cout<<endl;
    // for(int i=0 ;i<n;i++)
    // {
    //     cout<<endl;
    //     for(int j=0 ;j<n;j++)
    //     {
    //         cout<<arr[i][j]<<" ";
    //     }
    // }
    int count=0;
    for(int i=0 ;i<n;i++)
    {
        for(int j=0 ;j<n;j++)
        {
            if(arr[i][j]==0){
                count++;
            }
        }
    }
    cout << count;
    //cout<<endl<<count;
}