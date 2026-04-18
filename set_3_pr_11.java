class VolumeCalculator {
    public double calculateVolume(double side) {
        return side * side * side;
    }
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    public double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();
        double cubeVolume = vc.calculateVolume(5);
        System.out.println("Volume of Cube: " + cubeVolume);
        double rectangularCubeVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);
        double sphereVolume = vc.calculateVolume(3.0f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}

/*
Output:
Volume of Cube: 125.0
Volume of Rectangular Cube: 120.0
Volume of Sphere: 113.09733552923254
*/
