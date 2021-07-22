fun main() {
    print(arrayChange(mutableListOf(1, 1, 1)))
}


fun arrayChange(inputArray: MutableList<Int>): Int {
    var totalNumber=0
    for(i in 0 until inputArray.size-1)
        if(inputArray[i+1]<=inputArray[i]){
            while(inputArray[i+1]<=inputArray[i]){

                inputArray[i+1]=inputArray[i+1]+1
                totalNumber=totalNumber+1
            } }
    return totalNumber
}
