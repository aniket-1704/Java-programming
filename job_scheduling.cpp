bool static compare(Job a,Job b)
{
    return a.profit>=b.profit;
}
class Solution 
{
    public:
    //Function to find the maximum profit and the number of jobs done.
    vector<int> JobScheduling(Job arr[], int n) 
    { 
        // your code here
        sort(arr,arr+n,compare);
        int count=0;
        int max=arr[0].profit;
        //create a slot array storing whetr jobs filled or not
        //create result array storing jbs
        int result=0;
        bool job[n];
        for(int i=0;i<n;i++)
        {
            job[i]=false;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=min(n,arr[i].dead-1);j>=0;j--)
            {
                if(job[j]==false)
                {
                    job[j]=true;
                    result+=arr[i].profit;
                    count++;
                    break;
                }
            }
        }
       return vector<int>{count,result};
    } 
};