import java.util.ArrayList;
import java.util.List;


public class ViewerApp
{
    private List<Instructions> instructionsList = new ArrayList<Instructions>();

    public void receiveInstructions(Instructions instructions)
    {
        instructionsList.add(instructions);
    }

    public void implementInstructions()
    {
        for (Instructions instructions : instructionsList)
        {
            instructions.execute();
        }
        instructionsList.clear();
    }

}
