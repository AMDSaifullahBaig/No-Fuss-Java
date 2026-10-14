class Interface
{
    public interface Herbivores
    {
        void eatplant();
    }
    public interface Carnivores
    {
        void eatanimal();
    }
    public static class deer implements Herbivores
    {
        @Override
        public void eatplant()
        {
            System.out.println("Eating Plants");
        }
    }
    public static class lion implements Carnivores
    {
        @Override
        public void eatanimal()
        {
            System.out.println("Eating Animal");
        }
    }
    public static class bear implements Herbivores,Carnivores
    {
        @Override
        public void eatanimal()
        {
            System.out.println("Eating Animal");
        }
        @Override
        public void eatplant()
        {
            System.out.println("Eating Plant");
        }
    }
    public static void main(String args[])
    {
        deer animal1=new deer();
        animal1.eatplant();
        System.out.println();
        lion animal2=new lion();
        animal2.eatanimal();
        System.out.println();
        bear animal3=new bear();
        animal3.eatanimal();
        animal3.eatplant();
    }
}