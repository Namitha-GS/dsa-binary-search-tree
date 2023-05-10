int identicalTree(Node a, Node b)
{
    if(a==null && b==null){
        return 1;
    }
    else if(a!=null && b!=null){
        return (a.data==b.data && 
               identicalTree(a.left, b.left)==1 &&
               identicalTree(a.right, b.right)==1)
                                    ?1:0;
    }
    else{
        return 0;
    }
}
