import java.util.*;

class Node 
{
    int val;
    Node left,right;
    Node(int val)
    {
        this.val=val;
        left=right=null;
    }
    Node()
    {
        this.val=0;
        left=right=null;
    }
}
public class BST 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);   
        System.err.println("Enter the number of numbers");
        int n=sc.nextInt();

        Node tree=null;

        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            tree= insert(k,tree);
        }
        System.err.println("Pre-Order");
        display(tree);
        
        System.err.println("Enter any value to be deleted:");
        int val=sc.nextInt();
        
        tree=delete(val,tree);
        
        System.err.println("The element "+val+" is removed...");
        display(tree);
        sc.close();
    }  

    //Ithu insertion ku 
    
    static Node insert(int val,Node root)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }

        if(val<root.val)
        {
            root.left=insert(val, root.left);
        }
        else
        {
            root.right=insert(val,root.right);
        }

        return root;
    }

    //Idhu delete panrathuku

    static Node delete(int val,Node root)
    {
        if(root==null)
        {
            return null;
        }

        if(val<root.val)
        {
            root.left=delete(val,root.left );
        }
        else if(val>root.val)
        {
            root.right=delete(val,root.right);
        }
        //idhu varaikum namma node ah kandu pudikirom

        //ipo node kedaichiduchi
        else
        {
            if(root.right==null && root.left==null)
            {
                return null; //idhu leaf node so apdiye remove pantu link ah null ah mathrom
            }
            else if(root.right==null && root.left!=null)
            {
                return root.left; //oreyy child iruku and adha root la poturom
            }
            else if(root.left==null && root.right!=null)
            {
                return root.right;   //oreyy child iruku and adha root la poturom
            }

            //ipo rendu child um iruku so adhula right side la irukura min kandu pudichi adha thiiki podanum
            else
            {
                Node minNode= minNodee(root.right);
                root.val=minNode.val;
                root.right=delete(minNode.val,root.right);
            }
        }
        return root;
    }

    static Node minNodee(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    //Idhu Traverse panni Display panradhuku

    static void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.err.println(root.val);
        display(root.left);
        display(root.right);
    }
    
}
