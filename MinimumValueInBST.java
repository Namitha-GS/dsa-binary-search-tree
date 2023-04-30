static int minVal(Node root)
{
    Node current = root;
    while(current.left != null){
        current = current.left;
    }
    return current.data;
    
}
