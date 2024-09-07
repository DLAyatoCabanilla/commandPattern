public class TurnMusicPlayerOn  implements Instructions
{
    private MusicPlayer player;

    public TurnMusicPlayerOn(MusicPlayer player)
    {
        this.player = player;
    }

    public void execute()
    {
        player.turnPlayerOn();
    }
}
