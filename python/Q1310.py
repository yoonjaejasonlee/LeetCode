def xorQueries(self, arr , queries):
    temp = [0]
    answer = []

    for i in arr:
        temp.append(temp[-1] ^ i)

    for i, j in queries:
        answer.append(temp[j+1] ^ temp[i])
    
    return answer