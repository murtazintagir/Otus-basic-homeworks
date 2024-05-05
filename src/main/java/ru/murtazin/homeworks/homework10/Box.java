package ru.murtazin.homeworks.homework10;

public class Box {
    private String content;
    private String color;
    private final double length;
    private final double width;
    private final double height;
    private boolean coverPosition;

    public Box(String color, double length, double width, double height, boolean coverPosition) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.coverPosition = coverPosition;
    }

    public void getInfo() {
        System.out.println("Цвет: " + getColor() + "\n" +
                "Размеры Д x Ш x В: " + getLength() + " x " + getWidth() + " x " + getHeight() + "\n" +
                "Содержимое: " + getContent() + "\n" +
                coverPosition() + "\n");
    }

    public void repaint(String color) {
        setColor(color);
        System.out.println("Коробка перекрашена в цвет " + color);
    }

    public String coverPosition() {
        if (isCoverPosition()) {
            return "Коробка открыта";
        } else {
            return "Коробка закрыта";
        }
    }

    public void putContent(String obj) {
        if (!isCoverPosition()) {
            System.out.println("Коробка закрыта");
        } else {
            if (content == null || content.equals("")) {
                System.out.println("Предмет " + obj + " в коробке");
                setContent(obj);
            }
        }
    }

    public void deleteContent() {
        if (!isCoverPosition()) {
            System.out.println("Коробка закрыта");
        } else {
            if (content == null || content.equals("")) {
                System.out.println("Коробка уже пустая");
            } else {
                System.out.println("Предмет " + getContent() + " удален из коробки");
                setContent(null);
            }
        }
    }

    public void replaceContent(String obj) {
        if (!isCoverPosition()) {
            System.out.println("Коробка закрыта");
        } else {
            if (getContent().equals(obj)) {
                System.out.println("Предмет уже в коробке");
            } else {
                System.out.println("Предмет " + getContent() + " заменен на " + obj);
                setContent(obj);
            }
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isCoverPosition() {
        return coverPosition;
    }

    public void setCoverPosition(boolean coverPosition) {
        this.coverPosition = coverPosition;
    }
}
