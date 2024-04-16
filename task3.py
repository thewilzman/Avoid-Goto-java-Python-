def find_first_all_zero_row(matrix):
    n = len(matrix)  # Assuming the matrix is square
    found = False  #defining flag found

    for i in range(n):
        all_zeros = True  #first flag  condition
        for j in range(n):
            if matrix[i][j] != 0:
                all_zeros = False #second flag condition
                break
        if all_zeros:
            print(f'First all-zero row is: {i + 1}')  # Adding 1 to match the expected 1-based index
            found = True
            break

    if not found: # get prompt here if there none all zeros row 
        print('No all-zero row found.')

# Example case usage:
x = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]
find_first_all_zero_row(x)
