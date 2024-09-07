public class TurnMusicPlayerOff implements Instructions
{
    private MusicPlayer player;

    public TurnMusicPlayerOff(MusicPlayer player)
    {
        this.player = player;
    }

    public void execute()
    {
        player.turnPlayerOff();
    }
}

