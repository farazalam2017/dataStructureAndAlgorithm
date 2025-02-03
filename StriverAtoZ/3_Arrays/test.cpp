void merge(int arr, int low, int mid, int high){
  int temp[];
  int left = 0;
  int right = mid + 1;
  while(left<=mid && right<=high){
    if(arr[left]<arr[rigth]){
      temp.push_back(arr[left]);
      left++;
    }else{
      temp.push_back(arr[right]);
      right++;
    }
  }
  while(left<=mid){
    temp.push_back(arr[left]);
    left++l
  }
  while(right<=high){
    temp.push_back(arr[tight]);
    right++;
  }
  for (inti = ow; i <= hogh;i++){
    arr[i] = temp[i - low];
  }
}