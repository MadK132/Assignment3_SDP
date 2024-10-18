public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("mp3", "song.mp3");

        AudioAdapter wavAdapter = new AudioAdapter("wav");
        wavAdapter.play("wav", "song.wav");

        AudioAdapter aacAdapter = new AudioAdapter("aac");
        aacAdapter.play("aac", "song.aac");


        Device tv = new TVDevice();
        Device soundSystem = new SoundSystemDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        RemoteControl advancedRemote = new AdvancedRemote(soundSystem);

        basicRemote.turnOn();
        basicRemote.volumeUp();

        advancedRemote.turnOn();
        advancedRemote.volumeUp();


        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);



        allMenus.print();
    }
}


