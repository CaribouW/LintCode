#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>
#include<string>
#include<stack>
#include<queue>
#include<map>
#include<unordered_map>

struct TreeNode{
    int val ;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int val):val(val), left(NULL) , right(NULL){};
};

struct ListNode{
    int val;
    ListNode* next;
    ListNode(int val):val(val),next(NULL){};
};
using namespace std;