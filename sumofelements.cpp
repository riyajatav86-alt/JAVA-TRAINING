#include <iostream>
#include <numeric> // For std::accumulate (alternative)

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate the number of elements

    // Method 1: Using a for loop
    int sum_loop = 0;
    for (int i = 0; i < n; ++i) {
        sum_loop += arr[i];
    }
    std::cout << "Sum using for loop: " << sum_loop << std::endl;

    // Method 2: Using std::accumulate (requires <numeric>)
    // This is a more concise and often preferred way in C++
    int sum_accumulate = std::accumulate(arr, arr + n, 0);
    std::cout << "Sum using std::accumulate: " << sum_accumulate << std::endl;

    return 0;
}