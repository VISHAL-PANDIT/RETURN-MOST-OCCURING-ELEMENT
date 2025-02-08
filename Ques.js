const arr = [10, 5, 60, 10, 5, 10, 10, 10, 4, 10];
const frequency = {};

function Frequency(arr) {
    let mostFrequentElement = null;
    let highestFrequency = 0;

    for (let i = 0; i < arr.length; i++) {
        let count = 0; 
        for (let j = 0; j < arr.length; j++) {
            if (arr[i] === arr[j]) {
                count++; 
            }
        }
        frequency[arr[i]] = count;

        
        if (count > highestFrequency) {
            highestFrequency = count;
            mostFrequentElement = arr[i];
        }
    }

    
    if (highestFrequency > arr.length / 2) {
        return arr.indexOf(mostFrequentElement); 
    }

    return frequency; 
}

console.log(Frequency(arr));
