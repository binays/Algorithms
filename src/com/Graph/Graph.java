package com.Graph;
import java.util.Scanner;

/**
 * Created by binay on 7/19/16.
 */
public class Graph {
    int size=10;
    int[][] edge=new int[size][size];
    Vertex[] v=new Vertex[size];
    public Graph()
    {
        for(int i=0;i<size;i++)
        {
            v[i]=new Vertex();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                edge[i][j]=0;
            }
        }




    }

    public void construct()
    {
        Scanner scanner=new Scanner(System.in);
        int input=0;
        while(input!=4)
        {
            System.out.println("Enter your choice:1.Add vertex. 2.Add an edge. 3.Check adjacent vertex 4.quit ");
            input=scanner.nextInt();
            if(input==1)
            {
                System.out.println("Enter the content:");
                int el=scanner.nextInt();
                addVertex(el);
            }
            else if(input==2)
            {
                System.out.println("Enter first vertex to add an edge from:(0-9)");
                int v1=scanner.nextInt();
                System.out.println("Enter second vertex to add an edge to:(0-9)");
                int v2=scanner.nextInt();
                addEdge(v1,v2);
            }
            else if(input==3)
            {
                System.out.println("Enter first vertex: (0-9)");
                int v1=scanner.nextInt();
                System.out.println("Enter second vertex:(0-9)");
                int v2=scanner.nextInt();
                if(checkIsAdjacent(v1,v2))
                    System.out.println("They are adjacent");
                else
                    System.out.println("They are not adjacent");
            }
            else if(input==4)
            {
                break;
            }
        }
    }

    public void initializeGraph()
    {
        addVertex(1);
        addVertex(2);
        addVertex(3);
        addVertex(4);
        addVertex(5);
        addVertex(6);
        addVertex(7);
        addVertex(8);

        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(0,4);
        addEdge(0,1);
        addEdge(4,5);
        addEdge(5,3);
        addEdge(0,6);
        addEdge(6,7);
        addEdge(7,3);



    }

    public void addVertex(int el)
    {
        for(int i=0;i<size;i++)
        {
            if(!v[i].isInitialized())
            {
                v[i].setInitialized();
                v[i].setContent(el);
                System.out.println("Vertex added.");
                break;
            }
        }
    }

    public void addEdge(int v1,int v2)
    {
        if(edge[v1][v2]==1)
            System.out.println("Edge already added");
        else
        {
            if(v[v1].isInitialized() && v[v2].isInitialized()) {
                edge[v1][v2] = 1;
                edge[v2][v1] = 1;
                System.out.println("Edge added between vertices "+ v1+" "+v2);
            }
            else
            {
                System.out.println("Vertices not initialized. Can't add edge.");
            }
        }
    }

    public boolean checkIsAdjacent(int v1,int v2)
    {
        if(edge[v1][v2]==1)
            return true;
        else return false;
    }


}
