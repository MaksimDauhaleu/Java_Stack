function nextBigger(int){


    //Variables
    arr = [];
    new_arr =[];
    count = 0;
    last_arr = [];
    
    //To Array of Strings
    arr = (""+int).split("");
    
    //To Array
    for(i = 0; i < arr.length;i++){
      var a = parseInt(arr[i]);
      new_arr.push(a);
    }
    
    //Edge Case
    for(j = 0; j <= new_arr.length;j++){
      if(new_arr[j] > new_arr[j + 1]){
        count++;
        if(count == new_arr.length -1){
          console.log("There is no bigger number");
        }
      }
    }
    test(int);
    p = 2;
    m = 0;
    while(m < p){
      nextBigger(integer);
      m++;
    }
    }
    nextBigger(1234);
    
    
    
    function test(num){
    str = "";
    a = false;
    for(i = 0;i <= new_arr.length;i++){
      if(new_arr[new_arr.length - 1] > new_arr[new_arr.length - 2]){
      var last = new_arr[new_arr.length - 1];
      var temp = new_arr[new_arr.length - 2];
      new_arr[new_arr.length - 2] = last;
      new_arr[new_arr.length - 1] = temp;
      last_arr.push(last,temp);
      a = true;
      new_arr.pop();
      new_arr.pop();
    }
    if(a = true){
      break;
    }
    }
    for(var x = 0;x<new_arr.length;x++){
        new_arr[x] = new_arr[x] + ""
        str += new_arr[x];
        integer = parseInt(str);
    }
    }
    console.log(integer);
    console.log(new_arr);
    console.log(last_arr);
    