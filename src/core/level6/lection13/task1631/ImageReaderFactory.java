package core.level6.lection13.task1631;

import core.level6.lection13.task1631.common.*;

public class ImageReaderFactory  {
    private ImageReaderFactory() {

    }

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Unexpected");
        }

        switch (type) {
            case BMP -> {
                return new BmpReader();
            }
            case JPG -> {
                return new JpgReader();
            }
            case PNG -> {
                return new PngReader();
            }
            default -> throw new IllegalArgumentException("Unexpected type " + type);
        }
    }
}
