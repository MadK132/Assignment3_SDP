public class AudioAdapter implements AudioPlayer {
    AdvancedAudioPlayer advancedPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedPlayer = new AdvancedAudioPlayer();
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedPlayer = new AdvancedAudioPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedPlayer.playWAV(fileName);
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedPlayer.playAAC(fileName);
        }
    }
}
