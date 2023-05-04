class Qitems{
    Node node;
    int depth;
}
int minDepth(Node root)
{   
  if(root == null){
      return 0;
  }  
  Queue<Qitems> q = new LinkedList<>();
  
  Qitems qi = new Qitems();
  qi.node = root;
  qi.depth = 1;
  q.add(qi);
  
  while(!q.isEmpty()){
      Qitems frontNode = q.poll();
      Node node = frontNode.node;
      int depth = frontNode.depth;
      
      if(node.left != null){
          Qitems item = new Qitems();
          item.node = node.left;
          item.depth = depth + 1;
          q.add(item);
      }
      
      if(node.right != null){
          Qitems item = new Qitems();
          item.node = node.right;
          item.depth = depth + 1;
          q.add(item);
      }
      
      if(node.left == null && node.right == null){
          return depth;
      }
  }
  return 0;
}
