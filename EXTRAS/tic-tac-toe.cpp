#include <iostream>
using namespace std ;

char marker;
int player;

char board[3][3]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
void display()
{
    cout<<" "<<board[0][0]<<" | "<<board[0][1]<<" | "<<board[0][2]<<endl;
    cout<<"-----------"<<endl;
    cout<<" "<<board[1][0]<<" | "<<board[1][1]<<" | "<<board[1][2]<<endl;
    cout<<"-----------"<<endl;
    cout<<" "<<board[2][0]<<" | "<<board[2][1]<<" | "<<board[2][2]<<endl<<endl;
}
bool win()
{
    for(int i=0;i<3;i++)
    {
        if(board[i][0]==board[i][1] && board[i][1]==board[i][2])return true;
        if(board[0][i]==board[1][i] && board[1][i]==board[2][i])return true;
    }
    if(board[1][1]==board[0][0] && board[0][0]==board[2][2]) return true;
    if(board[0][2]==board[1][1] && board[1][1]==board[2][0]) return true;

    else return false;


}

bool place_marker(int slot)
{
    int row,col;
    if(slot%3==0)
    {
        row=(slot/3)-1;
        col=2;
    }
    else 
    {
        row= slot/3;
        col=(slot%3)-1;
    }

    if(board[row][col]!='X' && board[row][col]!='O')
    {
        board[row][col]=marker;
        return true;
    }
    else return false;

    
}
void switchh()
{
    if(marker=='X')marker='O';
    else marker='X';
    if(player==1) player=2;
    else player=1;

}

void game()
{
    int slot,w;
    char player1;
    cout<<"chose your marker (X,O) ";
    cin>>player1;
    marker=player1;
    for(int i=0;i<9;i++)
    {
        cout<<"Player "<<player<<"'s turn \n";
        cout<<"enter the slot number ";
        cin>>slot;
        if(slot<1||slot>9)
        {
            cout<<"invalid slot number!\n";
            i--;
            continue;
        }

        if(!place_marker(slot))
        {
            cout<<"invalid!Already occupied\n";
            i--;
            continue;
        }
    
        if(win())
        {
            cout<<"Player "<<player<<" won\n";break;
            display();
        }
       
        switchh();
        display();
    }
    

}
int main()
{
    player=1;
    display();
    game();

    return 0;
}
