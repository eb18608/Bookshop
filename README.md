# Bookshop
This application utilises a Visitor pattern approach to the Discount application problem. This approach
works exceedingly well with percentile discounts due to the transitive property of percentile discount applications.

## How to use:
### Unzipping the file:
- Extract the content of the attached '.zip' file into a known directory.

### How to run on IntelliJ:
- Open the a root folder ('Bookshop') as a project and allow build configurations.
- In the 'src.com.main.java' directory, there is a BasketList.txt file which you should edit.
    - This file functions as a simple csv, where each line is structured:
        - Line x:"name",<(int form)year_published>,<(float form)price>
- The filePath is required to read in a basket list. This could be the content route to the provided 
BasketList.txt file, or any absolute filepath to a .txt file in the format detailed above.