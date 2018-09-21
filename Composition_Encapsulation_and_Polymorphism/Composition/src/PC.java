public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void PowerUP(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        // Does fancy graphics
        monitor.drawPixelArt(1200, 750, "Green");
    }

}
