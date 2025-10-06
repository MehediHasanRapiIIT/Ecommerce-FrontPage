import React from "react";

const CategoryFilter = ({ categories, onSelect }) => {
  return (
    <>
      <select name="" id="categorySelect"
        onChange={(event) => onSelect(event.target.value)}
        className="form-control">
        <option value="">All Categories</option>
        {categories.map((category) => (
          <option key={category.id} value={category.id}>
            {category.name}
          </option>
        ))}

      </select>
    </>
  );
};

export default CategoryFilter;
